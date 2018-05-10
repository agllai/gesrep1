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

    public final QArticle Article;

    public final QBoutique Boutique;

    public final QDemande_Reparation demandeReparation;

    public final NumberPath<Long> IdEncaissement = createNumber("IdEncaissement", Long.class);

    public final NumberPath<Double> MontantAvance = createNumber("MontantAvance", Double.class);

    public final NumberPath<Double> MontantPaye = createNumber("MontantPaye", Double.class);

    public final StringPath MoyenPaiment = createString("MoyenPaiment");

    public final NumberPath<Long> Reduction = createNumber("Reduction", Long.class);

    public final NumberPath<Double> ResteAPaye = createNumber("ResteAPaye", Double.class);

    public final ListPath<Tache_Reparation, QTache_Reparation> tacheRep = this.<Tache_Reparation, QTache_Reparation>createList("tacheRep", Tache_Reparation.class, QTache_Reparation.class, PathInits.DIRECT2);

    public final NumberPath<Double> Tarif = createNumber("Tarif", Double.class);

    public final NumberPath<Double> TotalHT = createNumber("TotalHT", Double.class);

    public final NumberPath<Double> TotalTTC = createNumber("TotalTTC", Double.class);

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
        this.Article = inits.isInitialized("Article") ? new QArticle(forProperty("Article"), inits.get("Article")) : null;
        this.Boutique = inits.isInitialized("Boutique") ? new QBoutique(forProperty("Boutique")) : null;
        this.demandeReparation = inits.isInitialized("demandeReparation") ? new QDemande_Reparation(forProperty("demandeReparation"), inits.get("demandeReparation")) : null;
    }

}

