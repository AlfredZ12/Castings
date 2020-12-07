package ObjetosNegocio;

import ObjetosNegocio.Fase;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-03T17:14:19")
@StaticMetamodel(Prueba.class)
public class Prueba_ { 

    public static volatile SingularAttribute<Prueba, String> descripcion;
    public static volatile SingularAttribute<Prueba, Date> fecha;
    public static volatile SingularAttribute<Prueba, String> sala;
    public static volatile SingularAttribute<Prueba, Integer> idPrueba;
    public static volatile ListAttribute<Prueba, Fase> faseList;

}