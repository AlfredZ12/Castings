package ObjetosNegocio;

import ObjetosNegocio.Persona;
import ObjetosNegocio.Presencial;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-03T17:14:19")
@StaticMetamodel(Agentecasting.class)
public class Agentecasting_ { 

    public static volatile SingularAttribute<Agentecasting, Integer> numeroEmpleado;
    public static volatile ListAttribute<Agentecasting, Presencial> presencialList;
    public static volatile SingularAttribute<Agentecasting, Integer> idagenteCasting;
    public static volatile SingularAttribute<Agentecasting, Persona> idPersona;

}