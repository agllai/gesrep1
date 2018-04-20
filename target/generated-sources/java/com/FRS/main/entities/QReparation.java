package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReparation is a Querydsl query type for Reparation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QReparation extends EntityPathBase<Reparation> {

    private static final long serialVersionUID = -69059789L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReparation reparation = new QReparation("reparation");

    public final QArticle article;

    public final QBoutique boutique;

    public final QClient client;

    public final DatePath<java.sql.Date> date_heure = createDate("date_heure", java.sql.Date.class);

    public final QPersonnel personnel;

    public final NumberPath<Long> Rid = createNumber("Rid", Long.class);

    public QReparation(String variable) {
        this(Reparation.class, forVariable(variable), INITS);
    }

    public QReparation(Path<? extends Reparation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReparation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReparation(PathMetadata metadata, PathInits inits) {
        this(Reparation.class, metadata, inits);
    }

    public QReparation(Class<? extends Reparation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QArticle(forProperty("article"), inits.get("article")) : null;
        this.boutique = inits.isInitialized("boutique") ? new QBoutique(forProperty("boutique")) : null;
        this.client = inits.isInitialized("client") ? new QClient(forProperty("client")) : null;
        this.personnel = inits.isInitialized("personnel") ? new QPersonnel(forProperty("personnel"), inits.get("personnel")) : null;
    }

}

