package ObjetosNegocio;

import ObjetosNegocio.Agentecasting;
import ObjetosNegocio.Casting;
import ObjetosNegocio.Fase;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-03T17:14:19")
@StaticMetamodel(Presencial.class)
public class Presencial_ { 

    public static volatile SingularAttribute<Presencial, Casting> idCasting;
    public static volatile SingularAttribute<Presencial, Integer> idpresencial;
    public static volatile SingularAttribute<Presencial, String> numeroPersonas;
    public static volatile SingularAttribute<Presencial, Fase> idfase;
    public static volatile SingularAttribute<Presencial, Agentecasting> idAgenteCasting;

}