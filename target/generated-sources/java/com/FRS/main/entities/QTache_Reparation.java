package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTache_Reparation is a Querydsl query type for Tache_Reparation
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTache_Reparation extends EntityPathBase<Tache_Reparation> {

    private static final long serialVersionUID = 1016339199L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTache_Reparation tache_Reparation = new QTache_Reparation("tache_Reparation");

    public final QArticle article;

    public final QComposant composant;

    public final QPersonnel Createur;

    public final QDemande_Reparation demande_reparation;

    public final StringPath Description = createString("Description");

    public final QEncaissement Enc;

    public final QEtat etat;

    public final NumberPath<Long> Id_Tache_Réparation = createNumber("Id_Tache_Réparation", Long.class);

    public final StringPath Panne = createString("Panne");

    public final ListPath<Personnel, QPersonnel> Reparateur = this.<Personnel, QPersonnel>createList("Reparateur", Personnel.class, QPersonnel.class, PathInits.DIRECT2);

    public QTache_Reparation(String variable) {
        this(Tache_Reparation.class, forVariable(variable), INITS);
    }

    public QTache_Reparation(Path<? extends Tache_Reparation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTache_Reparation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTache_Reparation(PathMetadata metadata, PathInits inits) {
        this(Tache_Reparation.class, metadata, inits);
    }

    public QTache_Reparation(Class<? extends Tache_Reparation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.article = inits.isInitialized("article") ? new QArticle(forProperty("article"), inits.get("article")) : null;
        this.composant = inits.isInitialized("composant") ? new QComposant(forProperty("composant"), inits.get("composant")) : null;
        this.Createur = inits.isInitialized("Createur") ? new QPersonnel(forProperty("Createur"), inits.get("Createur")) : null;
        this.demande_reparation = inits.isInitialized("demande_reparation") ? new QDemande_Reparation(forProperty("demande_reparation"), inits.get("demande_reparation")) : null;
        this.Enc = inits.isInitialized("Enc") ? new QEncaissement(forProperty("Enc"), inits.get("Enc")) : null;
        this.etat = inits.isInitialized("etat") ? new QEtat(forProperty("etat")) : null;
    }

}

