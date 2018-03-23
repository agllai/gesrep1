package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPersonnel is a Querydsl query type for Personnel
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPersonnel extends EntityPathBase<Personnel> {

    private static final long serialVersionUID = -888195180L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPersonnel personnel = new QPersonnel("personnel");

    public final QBoutique boutique;

    public final StringPath Domaine_Réparation = createString("Domaine_Réparation");

    public final StringPath email = createString("email");

    public final NumberPath<Long> ID_Personnel = createNumber("ID_Personnel", Long.class);

    public final ComparablePath<java.io.File> image = createComparable("image", java.io.File.class);

    public final StringPath nom = createString("nom");

    public final StringPath profile = createString("profile");

    public final StringPath Prénom = createString("Prénom");

    public QPersonnel(String variable) {
        this(Personnel.class, forVariable(variable), INITS);
    }

    public QPersonnel(Path<? extends Personnel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPersonnel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPersonnel(PathMetadata metadata, PathInits inits) {
        this(Personnel.class, metadata, inits);
    }

    public QPersonnel(Class<? extends Personnel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.boutique = inits.isInitialized("boutique") ? new QBoutique(forProperty("boutique")) : null;
    }

}

