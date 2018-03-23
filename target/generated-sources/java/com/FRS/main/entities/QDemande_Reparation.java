package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDemande_Reparation is a Querydsl query type for Demande_Reparation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDemande_Reparation extends EntityPathBase<Demande_Reparation> {

    private static final long serialVersionUID = 1195356472L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDemande_Reparation demande_Reparation = new QDemande_Reparation("demande_Reparation");

    public final QReparation _super;

    // inherited
    public final QArticle article;

    // inherited
    public final QBoutique boutique;

    // inherited
    public final QClient client;

    //inherited
    public final DatePath<java.sql.Date> date_heure;

    public final StringPath Designation = createString("Designation");

    public final StringPath designation = createString("designation");

    public final NumberPath<Long> DRid = createNumber("DRid", Long.class);

    //inherited
    public final NumberPath<Integer> id_Créateur;

    //inherited
    public final NumberPath<Long> Rid;

    //inherited
    public final NumberPath<Double> tarif;

    public final QType_Panne type_panne;

    public QDemande_Reparation(String variable) {
        this(Demande_Reparation.class, forVariable(variable), INITS);
    }

    public QDemande_Reparation(Path<? extends Demande_Reparation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDemande_Reparation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDemande_Reparation(PathMetadata metadata, PathInits inits) {
        this(Demande_Reparation.class, metadata, inits);
    }

    public QDemande_Reparation(Class<? extends Demande_Reparation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QReparation(type, metadata, inits);
        this.article = _super.article;
        this.boutique = _super.boutique;
        this.client = _super.client;
        this.date_heure = _super.date_heure;
        this.id_Créateur = _super.id_Créateur;
        this.Rid = _super.Rid;
        this.tarif = _super.tarif;
        this.type_panne = inits.isInitialized("type_panne") ? new QType_Panne(forProperty("type_panne")) : null;
    }

}

