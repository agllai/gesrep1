package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBon_Reparation is a Querydsl query type for Bon_Reparation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBon_Reparation extends EntityPathBase<Bon_Reparation> {

    private static final long serialVersionUID = -50653551L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBon_Reparation bon_Reparation = new QBon_Reparation("bon_Reparation");

    public final QArticle article;

    public final QClient client;

    public final QPersonnel Créateur;

    public final DatePath<java.sql.Date> Date_Récupération = createDate("Date_Récupération", java.sql.Date.class);

    public final NumberPath<Long> Id_Bon_Réparation = createNumber("Id_Bon_Réparation", Long.class);

    public final ListPath<Personnel, QPersonnel> Réparateur = this.<Personnel, QPersonnel>createList("Réparateur", Personnel.class, QPersonnel.class, PathInits.DIRECT2);

    public final QReparation réparation;

    public final QType_Panne type_panne;

    public QBon_Reparation(String variable) {
        this(Bon_Reparation.class, forVariable(variable), INITS);
    }

    public QBon_Reparation(Path<? extends Bon_Reparation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBon_Reparation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBon_Reparation(PathMetadata metadata, PathInits inits) {
        this(Bon_Reparation.class, metadata, inits);
    }

    public QBon_Reparation(Class<? extends Bon_Reparation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QArticle(forProperty("article"), inits.get("article")) : null;
        this.client = inits.isInitialized("client") ? new QClient(forProperty("client")) : null;
        this.Créateur = inits.isInitialized("Créateur") ? new QPersonnel(forProperty("Créateur"), inits.get("Créateur")) : null;
        this.réparation = inits.isInitialized("réparation") ? new QReparation(forProperty("réparation"), inits.get("réparation")) : null;
        this.type_panne = inits.isInitialized("type_panne") ? new QType_Panne(forProperty("type_panne")) : null;
    }

}

