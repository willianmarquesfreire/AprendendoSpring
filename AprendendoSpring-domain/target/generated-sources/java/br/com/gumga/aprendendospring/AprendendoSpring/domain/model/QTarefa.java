package br.com.gumga.aprendendospring.AprendendoSpring.domain.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTarefa is a Querydsl query type for Tarefa
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTarefa extends EntityPathBase<Tarefa> {

    private static final long serialVersionUID = 1063432906L;

    public static final QTarefa tarefa = new QTarefa("tarefa");

    public final DatePath<java.util.Calendar> dataFinalizado = createDate("dataFinalizado", java.util.Calendar.class);

    public final StringPath descricao = createString("descricao");

    public final BooleanPath finalizado = createBoolean("finalizado");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QTarefa(String variable) {
        super(Tarefa.class, forVariable(variable));
    }

    public QTarefa(Path<? extends Tarefa> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTarefa(PathMetadata<?> metadata) {
        super(Tarefa.class, metadata);
    }

}

