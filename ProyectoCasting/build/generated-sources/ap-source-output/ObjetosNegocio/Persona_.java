package ObjetosNegocio;

import ObjetosNegocio.Agentecasting;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-03T17:14:19")
@StaticMetamodel(Persona.class)
public class Persona_ { 

    public static volatile SingularAttribute<Persona, String> direccion;
    public static volatile SingularAttribute<Persona, String> nombre;
    public static volatile SingularAttribute<Persona, Integer> idPersona;
    public static volatile SingularAttribute<Persona, String> curp;
    public static volatile SingularAttribute<Persona, String> rfc;
    public static volatile ListAttribute<Persona, Agentecasting> agentecastingList;

}