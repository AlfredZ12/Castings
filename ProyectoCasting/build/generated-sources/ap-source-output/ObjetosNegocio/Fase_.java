package ObjetosNegocio;

import ObjetosNegocio.Presencial;
import ObjetosNegocio.Prueba;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-03T17:14:19")
@StaticMetamodel(Fase.class)
public class Fase_ { 

    public static volatile SingularAttribute<Fase, Date> fechainicio;
    public static volatile SingularAttribute<Fase, Integer> idfase;
    public static volatile SingularAttribute<Fase, Prueba> idPrueba;
    public static volatile ListAttribute<Fase, Presencial> presencialList;
    public static volatile SingularAttribute<Fase, Date> fechafinal;

}