package de.unibi.agbi.biodwh2.reactome.etl;

import de.unibi.agbi.biodwh2.reactome.entities.*;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.FragmentDeletionModification;
import de.unibi.agbi.biodwh2.reactome.entities.FragmentInsertionModification;
import de.unibi.agbi.biodwh2.reactome.entities.FragmentModification;
import de.unibi.agbi.biodwh2.reactome.entities.FragmentReplacedModification;
import de.unibi.agbi.biodwh2.reactome.entities.ReplacedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.CrosslinkedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.InterChainCrosslinkedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.IntraChainCrosslinkedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.GroupModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.ModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.TranslationalModification;
import de.unibi.agbi.biodwh2.reactome.entities.CatalystActivityReference;
import de.unibi.agbi.biodwh2.reactome.entities.ControlReference;
import de.unibi.agbi.biodwh2.reactome.entities.RegulationReference;
import de.unibi.agbi.biodwh2.reactome.entities.Event;
import de.unibi.agbi.biodwh2.reactome.entities.Pathway;
import de.unibi.agbi.biodwh2.reactome.entities.TopLevelPathway;
import de.unibi.agbi.biodwh2.reactome.entities.Disease;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology;
import de.unibi.agbi.biodwh2.reactome.entities.PsiMod;
import de.unibi.agbi.biodwh2.reactome.entities.SequenceOntology;
import de.unibi.agbi.biodwh2.reactome.entities.GO_BiologicalProcess;
import de.unibi.agbi.biodwh2.reactome.entities.Compartment;
import de.unibi.agbi.biodwh2.reactome.entities.GO_CellularComponent;
import de.unibi.agbi.biodwh2.reactome.entities.GO_MolecularFunction;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term;
import de.unibi.agbi.biodwh2.reactome.entities.Interaction;
import de.unibi.agbi.biodwh2.reactome.entities.UndirectedInteraction;
import de.unibi.agbi.biodwh2.reactome.entities.ChemicalDrug;
import de.unibi.agbi.biodwh2.reactome.entities.Drug;
import de.unibi.agbi.biodwh2.reactome.entities.ProteinDrug;
import de.unibi.agbi.biodwh2.reactome.entities.CandidateSet;
import de.unibi.agbi.biodwh2.reactome.entities.DefinedSet;
import de.unibi.agbi.biodwh2.reactome.entities.EntitySet;
import de.unibi.agbi.biodwh2.reactome.entities.EntityWithAccessionedSequence;
import de.unibi.agbi.biodwh2.reactome.entities.GenomeEncodedEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Book;
import de.unibi.agbi.biodwh2.reactome.entities.LiteratureReference;
import de.unibi.agbi.biodwh2.reactome.entities.Publication;
import de.unibi.agbi.biodwh2.reactome.entities.URL;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceGroup;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceMolecule;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceDNASequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceGeneProduct;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceIsoform;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceRNASequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceSequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceTherapeutic;
import de.unibi.agbi.biodwh2.reactome.entities.NegativeGeneExpressionRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.NegativeRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.PositiveGeneExpressionRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.PositiveRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.Requirement;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation;
import de.unibi.agbi.biodwh2.reactome.entities.Species;
import de.unibi.agbi.biodwh2.reactome.entities.Taxon;

import java.nio.file.Path;

/**
 * Created by manuel on 23.01.20.
 */
public class ReactomeModel {
    public static Class[] entitylist = {
            FragmentDeletionModification.class, FragmentInsertionModification.class, FragmentReplacedModification.class,
            ReplacedResidue.class, InterChainCrosslinkedResidue.class, IntraChainCrosslinkedResidue.class,
            ModifiedResidue.class, GroupModifiedResidue.class, CatalystActivityReference.class,
            RegulationReference.class, TopLevelPathway.class, BlackBoxEvent.class, Depolymerisation.class,
            FailedReaction.class, Polymerisation.class, Reaction.class, Disease.class, PsiMod.class,
            SequenceOntology.class, Compartment.class, GO_CellularComponent.class, GO_BiologicalProcess.class,
            GO_MolecularFunction.class, UndirectedInteraction.class, ChemicalDrug.class, ProteinDrug.class,
            CandidateSet.class, DefinedSet.class, EntityWithAccessionedSequence.class, GenomeEncodedEntity.class,
            Complex.class, OtherEntity.class, Polymer.class, SimpleEntity.class, LiteratureReference.class, URL.class,
            ReferenceGeneProduct.class, ReferenceIsoform.class, ReferenceDNASequence.class, Book.class,
            ReferenceRNASequence.class, ReferenceGroup.class, ReferenceMolecule.class, ReferenceTherapeutic.class,
            NegativeGeneExpressionRegulation.class, NegativeRegulation.class, PositiveGeneExpressionRegulation.class,
            PositiveRegulation.class, Requirement.class, Species.class, Taxon.class, Affiliation.class,
            DatabaseIdentifier.class, CatalystActivity.class, EntityFunctionalStatus.class, Figure.class,
            FunctionalStatus.class, FunctionalStatusType.class, InstanceEdit.class, Person.class,
            ReferenceDatabase.class, Summation.class, FragmentModification.class, CrosslinkedResidue.class,
            TranslationalModification.class, AbstractModifiedResidue.class, ControlReference.class,
            ReactionLikeEvent.class, Event.class, ExternalOntology.class, GO_Term.class, Interaction.class, Drug.class,
            EntitySet.class, PhysicalEntity.class, Publication.class, ReferenceSequence.class, ReferenceEntity.class,
            Regulation.class, DatabaseObject.class, EvidenceType.class, ModificationType.class, Pathway.class
    };
}
