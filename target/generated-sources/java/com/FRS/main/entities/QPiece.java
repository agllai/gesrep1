package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPiece is a Querydsl query type for Piece
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QPiece extends EntityPathBase<Piece> {

    private static final long serialVersionUID = -1931163038L;

    public static final QPiece piece = new QPiece("piece");

    public final NumberPath<Long> Id_Piece = createNumber("Id_Piece", Long.class);

    public final StringPath Marque = createString("Marque");

    public final StringPath Model = createString("Model");

    public final NumberPath<Double> tarif = createNumber("tarif", Double.class);

    public final StringPath Type_Matriel = createString("Type_Matriel");

    public QPiece(String variable) {
        super(Piece.class, forVariable(variable));
    }

    public QPiece(Path<? extends Piece> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPiece(PathMetadata metadata) {
        super(Piece.class, metadata);
    }

}

