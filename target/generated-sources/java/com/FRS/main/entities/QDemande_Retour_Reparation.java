package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDemande_Retour_Reparation is a Querydsl query type for Demande_Retour_Reparation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDemande_Retour_Reparation extends EntityPathBase<Demande_Retour_Reparation> {

    private static final long serialVersionUID = 202970058L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDemande_Retour_Reparation demande_Retour_Reparation = new QDemande_Retour_Reparation("demande_Retour_Reparation");

    public final QBoutique boutique;

    public final QPersonnel Creator;

    public final DatePath<java.sql.Date> date_heure = createDate("date_heure", java.sql.Date.class);

    public final QDemande_Reparation demande_réparation;

    public final StringPath Designation = createString("Designation");

    public final NumberPath<Long> DRRid = createNumber("DRRid", Long.class);

    public final StringPath panne = createString("panne");

    public final QType_Panne type_panne;

    public QDemande_Retour_Reparation(String variable) {
        this(Demande_Retour_Reparation.class, forVariable(variable), INITS);
    }

    public QDemande_Retour_Reparation(Path<? extends Demande_Retour_Reparation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDemande_Retour_Reparation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDemande_Retour_Reparation(PathMetadata metadata, PathInits inits) {
        this(Demande_Retour_Reparation.class, metadata, inits);
    }

    public QDemande_Retour_Reparation(Class<? extends Demande_Retour_Reparation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boutique = inits.isInitialized("boutique") ? new QBoutique(forProperty("boutique")) : null;
        this.Creator = inits.isInitialized("Creator") ? new QPersonnel(forProperty("Creator"), inits.get("Creator")) : null;
        this.demande_réparation = inits.isInitialized("demande_réparation") ? new QDemande_Reparation(forProperty("demande_réparation"), inits.get("demande_réparation")) : null;
        this.type_panne = inits.isInitialized("type_panne") ? new QType_Panne(forProperty("type_panne")) : null;
    }

}

