package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEncaissement is a Querydsl query type for Encaissement
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEncaissement extends EntityPathBase<Encaissement> {

    private static final long serialVersionUID = 199344685L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEncaissement encaissement = new QEncaissement("encaissement");

    public final QArticle article;

    public final QBoutique boutique;

    public final QDemande_Reparation demande_reparation;

    public final NumberPath<Long> Id_Encaissement = createNumber("Id_Encaissement", Long.class);

    public final NumberPath<Double> Montant_avance = createNumber("Montant_avance", Double.class);

    public final NumberPath<Double> Montant_paye = createNumber("Montant_paye", Double.class);

    public final StringPath Moyen_paiment = createString("Moyen_paiment");

    public final NumberPath<Double> Reste_a_Paye = createNumber("Reste_a_Paye", Double.class);

    public final NumberPath<Long> Réduction = createNumber("Réduction", Long.class);

    public final CollectionPath<Tache_Reparation, QTache_Reparation> tacheRep = this.<Tache_Reparation, QTache_Reparation>createCollection("tacheRep", Tache_Reparation.class, QTache_Reparation.class, PathInits.DIRECT2);

    public final NumberPath<Double> tarif = createNumber("tarif", Double.class);

    public final NumberPath<Double> Total_HT = createNumber("Total_HT", Double.class);

    public final NumberPath<Double> Total_TTC = createNumber("Total_TTC", Double.class);

    public final NumberPath<Integer> TVA = createNumber("TVA", Integer.class);

    public QEncaissement(String variable) {
        this(Encaissement.class, forVariable(variable), INITS);
    }

    public QEncaissement(Path<? extends Encaissement> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEncaissement(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEncaissement(PathMetadata metadata, PathInits inits) {
        this(Encaissement.class, metadata, inits);
    }

    public QEncaissement(Class<? extends Encaissement> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QArticle(forProperty("article"), inits.get("article")) : null;
        this.boutique = inits.isInitialized("boutique") ? new QBoutique(forProperty("boutique")) : null;
        this.demande_reparation = inits.isInitialized("demande_reparation") ? new QDemande_Reparation(forProperty("demande_reparation"), inits.get("demande_reparation")) : null;
    }

}

