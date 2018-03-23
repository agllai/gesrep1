package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QComposant is a Querydsl query type for Composant
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QComposant extends EntityPathBase<Composant> {

    private static final long serialVersionUID = 1153808712L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComposant composant = new QComposant("composant");

    public final NumberPath<Long> Id_Composant = createNumber("Id_Composant", Long.class);

    public final StringPath Nom_Composant = createString("Nom_Composant");

    public final QPiece piece;

    public final NumberPath<Double> tarif = createNumber("tarif", Double.class);

    public final NumberPath<Double> tarif_minimal = createNumber("tarif_minimal", Double.class);

    public QComposant(String variable) {
        this(Composant.class, forVariable(variable), INITS);
    }

    public QComposant(Path<? extends Composant> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QComposant(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QComposant(PathMetadata metadata, PathInits inits) {
        this(Composant.class, metadata, inits);
    }

    public QComposant(Class<? extends Composant> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.piece = inits.isInitialized("piece") ? new QPiece(forProperty("piece")) : null;
    }

}

