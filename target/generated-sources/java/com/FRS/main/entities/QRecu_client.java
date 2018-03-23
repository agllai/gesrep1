package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRecu_client is a Querydsl query type for Recu_client
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRecu_client extends EntityPathBase<Recu_client> {

    private static final long serialVersionUID = 744846297L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRecu_client recu_client = new QRecu_client("recu_client");

    public final StringPath Commentaire = createString("Commentaire");

    public final DatePath<java.sql.Date> Date_heure = createDate("Date_heure", java.sql.Date.class);

    public final QPersonnel Employer;

    public final NumberPath<Long> Id_Recus_Client = createNumber("Id_Recus_Client", Long.class);

    public final QReparation reparation;

    public QRecu_client(String variable) {
        this(Recu_client.class, forVariable(variable), INITS);
    }

    public QRecu_client(Path<? extends Recu_client> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRecu_client(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRecu_client(PathMetadata metadata, PathInits inits) {
        this(Recu_client.class, metadata, inits);
    }

    public QRecu_client(Class<? extends Recu_client> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.Employer = inits.isInitialized("Employer") ? new QPersonnel(forProperty("Employer"), inits.get("Employer")) : null;
        this.reparation = inits.isInitialized("reparation") ? new QReparation(forProperty("reparation"), inits.get("reparation")) : null;
    }

}

