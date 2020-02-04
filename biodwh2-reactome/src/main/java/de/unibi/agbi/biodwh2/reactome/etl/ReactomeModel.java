package de.unibi.agbi.biodwh2.reactome.etl;

import de.unibi.agbi.biodwh2.reactome.entities.*;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.AbstractModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.FragmentModification.FragmentDeletionModification;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.FragmentModification.FragmentInsertionModification;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.FragmentModification.FragmentModification;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.FragmentModification.FragmentReplacedModification;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.GeneticallyModifiedResidue.ReplacedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification.CrosslinkedResidue.CrosslinkedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification.CrosslinkedResidue.InterChainCrosslinkedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification.CrosslinkedResidue.IntraChainCrosslinkedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification.GroupModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification.ModifiedResidue;
import de.unibi.agbi.biodwh2.reactome.entities.AbstractModifiedResidue.TranslationalModification.TranslationalModification;
import de.unibi.agbi.biodwh2.reactome.entities.ControlReference.CatalystActivityReference;
import de.unibi.agbi.biodwh2.reactome.entities.ControlReference.ControlReference;
import de.unibi.agbi.biodwh2.reactome.entities.ControlReference.RegulationReference;
import de.unibi.agbi.biodwh2.reactome.entities.Event.Event;
import de.unibi.agbi.biodwh2.reactome.entities.Event.Pathway.Pathway;
import de.unibi.agbi.biodwh2.reactome.entities.Event.Pathway.TopLevelPathway;
import de.unibi.agbi.biodwh2.reactome.entities.Event.ReactionLikeEvent.*;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.Disease;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.ExternalOntology;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.PsiMod;
import de.unibi.agbi.biodwh2.reactome.entities.ExternalOntology.SequenceOntology;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_BiologicalProcess;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_CellularComponent.Compartment;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_CellularComponent.GO_CellularComponent;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_MolecularFunction;
import de.unibi.agbi.biodwh2.reactome.entities.GO_Term.GO_Term;
import de.unibi.agbi.biodwh2.reactome.entities.Interaction.Interaction;
import de.unibi.agbi.biodwh2.reactome.entities.Interaction.UndirectedInteraction;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.*;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.Drug.ChemicalDrug;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.Drug.Drug;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.Drug.ProteinDrug;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.EntitySet.CandidateSet;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.EntitySet.DefinedSet;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.EntitySet.EntitySet;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.GenomeEncodedEntity.EntityWithAccessionedSequence;
import de.unibi.agbi.biodwh2.reactome.entities.PhysicalEntity.GenomeEncodedEntity.GenomeEncodedEntity;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.Book;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.LiteratureReference;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.Publication;
import de.unibi.agbi.biodwh2.reactome.entities.Publication.URL;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceEntity;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceGroup;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceMolecule;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceDNASequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceGeneProduct.ReferenceGeneProduct;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceGeneProduct.ReferenceIsoform;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceRNASequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceSequence.ReferenceSequence;
import de.unibi.agbi.biodwh2.reactome.entities.ReferenceEntity.ReferenceTherapeutic;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.NegativeRegulation.NegativeGeneExpressionRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.NegativeRegulation.NegativeRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.PositiveRegulation.PositiveGeneExpressionRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.PositiveRegulation.PositiveRegulation;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.PositiveRegulation.Requirement;
import de.unibi.agbi.biodwh2.reactome.entities.Regulation.Regulation;
import de.unibi.agbi.biodwh2.reactome.entities.Taxon.Species;
import de.unibi.agbi.biodwh2.reactome.entities.Taxon.Taxon;

/**
 * Created by manuel on 23.01.20.
 */
public class ReactomeModel {
    public static Class[] entitylist = {Pathway.class, CatalystActivity.class,
            FragmentDeletionModification.class, FragmentInsertionModification.class, FragmentReplacedModification.class,
            ReplacedResidue.class, InterChainCrosslinkedResidue.class, IntraChainCrosslinkedResidue.class,
            ModifiedResidue.class, GroupModifiedResidue.class, CatalystActivityReference.class,
            RegulationReference.class,  TopLevelPathway.class, BlackBoxEvent.class,
            Depolymerisation.class, FailedReaction.class, Polymerisation.class, Reaction.class, Disease.class,
            PsiMod.class, SequenceOntology.class, Compartment.class, GO_CellularComponent.class,
            GO_BiologicalProcess.class, GO_MolecularFunction.class, UndirectedInteraction.class, ChemicalDrug.class,
            ProteinDrug.class, CandidateSet.class, DefinedSet.class, EntityWithAccessionedSequence.class,
            GenomeEncodedEntity.class, Complex.class, OtherEntity.class, Polymer.class, SimpleEntity.class, Book.class,
            LiteratureReference.class, URL.class, ReferenceGeneProduct.class, ReferenceIsoform.class,
            ReferenceDNASequence.class, ReferenceRNASequence.class, ReferenceGroup.class, ReferenceMolecule.class,
            ReferenceTherapeutic.class, NegativeGeneExpressionRegulation.class, NegativeRegulation.class,
            PositiveGeneExpressionRegulation.class, PositiveRegulation.class, Requirement.class, Species.class,
            Taxon.class, Affiliation.class, DatabaseIdentifier.class,
            EntityFunctionalStatus.class, Figure.class, FunctionalStatus.class, FunctionalStatusType.class,
            InstanceEdit.class, Person.class, ReferenceDatabase.class, Summation.class, FragmentModification.class,
            CrosslinkedResidue.class, TranslationalModification.class, AbstractModifiedResidue.class,
            ControlReference.class, ReactionLikeEvent.class, Event.class, ExternalOntology.class, GO_Term.class,
            Interaction.class, Drug.class, EntitySet.class, PhysicalEntity.class, Publication.class,
            ReferenceSequence.class, ReferenceEntity.class, Regulation.class, DatabaseObject.class
    };
}
