package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QArticle is a Querydsl query type for Article
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QArticle extends EntityPathBase<Article> {

    private static final long serialVersionUID = -577765526L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QArticle article = new QArticle("article");

    public final QBoutique boutique;

    public final StringPath CodeSecurite = createString("CodeSecurite");

    public final StringPath commentaire = createString("commentaire");

    public final DatePath<java.sql.Date> DateRécupération = createDate("DateRécupération", java.sql.Date.class);

    public final NumberPath<Long> IdArticle = createNumber("IdArticle", Long.class);

    public final BooleanPath Livraison = createBoolean("Livraison");

    public final StringPath Marque = createString("Marque");

    public final StringPath Model = createString("Model");

    public final StringPath operateur = createString("operateur");

    public final QReparation reparation;

    public final StringPath SerialNumber = createString("SerialNumber");

    public QArticle(String variable) {
        this(Article.class, forVariable(variable), INITS);
    }

    public QArticle(Path<? extends Article> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QArticle(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QArticle(PathMetadata metadata, PathInits inits) {
        this(Article.class, metadata, inits);
    }

    public QArticle(Class<? extends Article> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boutique = inits.isInitialized("boutique") ? new QBoutique(forProperty("boutique")) : null;
        this.reparation = inits.isInitialized("reparation") ? new QReparation(forProperty("reparation"), inits.get("reparation")) : null;
    }

}

