package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBoutique is a Querydsl query type for Boutique
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBoutique extends EntityPathBase<Boutique> {

    private static final long serialVersionUID = -1611590800L;

    public static final QBoutique boutique = new QBoutique("boutique");

    public final StringPath Adresse = createString("Adresse");

    public final StringPath Adresse_Societe = createString("Adresse_Societe");

    public final StringPath Code = createString("Code");

    public final StringPath Contact = createString("Contact");

    public final NumberPath<Long> Id_boutique = createNumber("Id_boutique", Long.class);

    public final StringPath Mention_legale = createString("Mention_legale");

    public final StringPath Nom_Societe = createString("Nom_Societe");

    public final StringPath Region = createString("Region");

    public QBoutique(String variable) {
        super(Boutique.class, forVariable(variable));
    }

    public QBoutique(Path<? extends Boutique> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoutique(PathMetadata metadata) {
        super(Boutique.class, metadata);
    }

}

