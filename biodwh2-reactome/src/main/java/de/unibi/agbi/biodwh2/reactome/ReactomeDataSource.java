package de.unibi.agbi.biodwh2.reactome;

import de.unibi.agbi.biodwh2.core.DataSource;
import de.unibi.agbi.biodwh2.core.etl.GraphExporter;
import de.unibi.agbi.biodwh2.core.etl.Parser;
import de.unibi.agbi.biodwh2.core.etl.RDFExporter;
import de.unibi.agbi.biodwh2.core.etl.Updater;
import de.unibi.agbi.biodwh2.core.model.graph.Graph;
import de.unibi.agbi.biodwh2.reactome.etl.ReactomeExporter;
import de.unibi.agbi.biodwh2.reactome.etl.ReactomeParser;

/**
 * Created by manuel on 11.12.19.
 * <p>
 * Read and create all nodes with basic datatypes.
 * Read all relationships and set the missing attributes according to them.
 */
public class ReactomeDataSource extends DataSource {
    public Graph graph;

    @Override
    public String getId() {
        return "Reactome";
    }

    @Override
    public Updater getUpdater() {
        return null;
    }

    @Override
    public Parser getParser() {
        return new ReactomeParser();
    }

    @Override
    public RDFExporter getRdfExporter() {
        return null;
    }

    @Override
    public GraphExporter getGraphExporter() {
        return new ReactomeExporter();
    }
}
