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

    public final NumberPath<Long> Id_Client = createNumber("Id_Client", Long.class);

    public final StringPath mail = createString("mail");

    public final StringPath nom = createString("nom");

    public final StringPath Num_tel = createString("Num_tel");

    public final StringPath type_client = createString("type_client");

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
