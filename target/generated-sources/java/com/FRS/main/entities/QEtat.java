package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEtat is a Querydsl query type for Etat
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEtat extends EntityPathBase<Etat> {

    private static final long serialVersionUID = 75934510L;

    public static final QEtat etat = new QEtat("etat");

    public final StringPath Code = createString("Code");

    public final StringPath Designation = createString("Designation");

    public final NumberPath<Long> Id_Etat = createNumber("Id_Etat", Long.class);

    public final StringPath Nom = createString("Nom");

    public QEtat(String variable) {
        super(Etat.class, forVariable(variable));
    }

    public QEtat(Path<? extends Etat> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEtat(PathMetadata metadata) {
        super(Etat.class, metadata);
    }

}

