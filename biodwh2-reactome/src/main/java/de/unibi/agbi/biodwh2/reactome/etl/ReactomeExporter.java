package de.unibi.agbi.biodwh2.reactome.etl;

import de.unibi.agbi.biodwh2.core.DataSource;
import de.unibi.agbi.biodwh2.core.etl.GraphExporter;
import de.unibi.agbi.biodwh2.core.model.graph.Graph;
import de.unibi.agbi.biodwh2.reactome.ReactomeDataSource;

/**
 * Created by manuel on 22.01.20.
 */
public class ReactomeExporter extends GraphExporter {

    @Override
    protected Graph exportGraph(final DataSource dataSource) {
        return ((ReactomeDataSource) dataSource).graph;
    }
}
