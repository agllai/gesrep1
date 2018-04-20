package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDevis is a Querydsl query type for Devis
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDevis extends EntityPathBase<Devis> {

    private static final long serialVersionUID = -1942347917L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDevis devis = new QDevis("devis");

    public final QReparation _super;

    // inherited
    public final QArticle article;

    // inherited
    public final QBoutique boutique;

    // inherited
    public final QClient client;

    public final StringPath Commentaire = createString("Commentaire");

    public final StringPath commentaire = createString("commentaire");

    //inherited
    public final DatePath<java.sql.Date> date_heure;

    public final NumberPath<Long> DEid = createNumber("DEid", Long.class);

    // inherited
    public final QPersonnel personnel;

    //inherited
    public final NumberPath<Long> Rid;

    public QDevis(String variable) {
        this(Devis.class, forVariable(variable), INITS);
    }

    public QDevis(Path<? extends Devis> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDevis(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDevis(PathMetadata metadata, PathInits inits) {
        this(Devis.class, metadata, inits);
    }

    public QDevis(Class<? extends Devis> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QReparation(type, metadata, inits);
        this.article = _super.article;
        this.boutique = _super.boutique;
        this.client = _super.client;
        this.date_heure = _super.date_heure;
        this.personnel = _super.personnel;
        this.Rid = _super.Rid;
    }

}

