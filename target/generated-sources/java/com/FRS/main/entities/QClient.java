package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QClient is a Querydsl query type for Client
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClient extends EntityPathBase<Client> {

    private static final long serialVersionUID = -105798953L;

    public static final QClient client = new QClient("client");

    public final StringPath adresse = createString("adresse");

    public final NumberPath<Long> idClient = createNumber("idClient", Long.class);

    public final StringPath mail = createString("mail");

    public final StringPath nom = createString("nom");

    public final NumberPath<Long> numtel = createNumber("numtel", Long.class);

    public final StringPath typeClient = createString("typeClient");

    public QClient(String variable) {
        super(Client.class, forVariable(variable));
    }

    public QClient(Path<? extends Client> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClient(PathMetadata metadata) {
        super(Client.class, metadata);
    }

}

