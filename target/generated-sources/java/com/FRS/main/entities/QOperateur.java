package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QOperateur is a Querydsl query type for Operateur
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QOperateur extends EntityPathBase<Operateur> {

    private static final long serialVersionUID = -78697323L;

    public static final QOperateur operateur = new QOperateur("operateur");

    public final StringPath code = createString("code");

    public final NumberPath<Long> Id_Operateur = createNumber("Id_Operateur", Long.class);

    public final StringPath Nom = createString("Nom");

    public QOperateur(String variable) {
        super(Operateur.class, forVariable(variable));
    }

    public QOperateur(Path<? extends Operateur> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOperateur(PathMetadata metadata) {
        super(Operateur.class, metadata);
    }

}

