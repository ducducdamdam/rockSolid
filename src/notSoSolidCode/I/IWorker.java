
/*
Mal Ejemplo 2 tipos de trabajadores misma interfaz, MAL.
Worker : work(), eat()
Pero si quisiese añadir un robot no podria evitar darle el metodo eat().
*/
package notSoSolidCode.I;

public interface IWorker {
    public void work();
    public void eat();
}
