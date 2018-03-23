package com.FRS.main.entities;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QType_Panne is a Querydsl query type for Type_Panne
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QType_Panne extends EntityPathBase<Type_Panne> {

    private static final long serialVersionUID = 738362043L;

    public static final QType_Panne type_Panne = new QType_Panne("type_Panne");

    public final StringPath Code = createString("Code");

    public final StringPath Designation = createString("Designation");

    public final NumberPath<Long> Id_Type_Panne = createNumber("Id_Type_Panne", Long.class);

    public final StringPath Nom_Type_Panne = createString("Nom_Type_Panne");

    public QType_Panne(String variable) {
        super(Type_Panne.class, forVariable(variable));
    }

    public QType_Panne(Path<? extends Type_Panne> path) {
        super(path.getType(), path.getMetadata());
    }

    public QType_Panne(PathMetadata metadata) {
        super(Type_Panne.class, metadata);
    }

}

