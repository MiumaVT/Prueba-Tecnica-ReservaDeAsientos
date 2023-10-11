# Prueba-Tecnica-ReservaDeAsientos
Prueba técnica de puesto Trainee sobre Reserva de asientos 100% lógica, sin IGU ni BD

-----INSTRUCIONES-----

1er Parte
Suponer un sistema de reserva de asientos para un anfiteatro. El teatro
cuenta con 10 filas de 10 asientos cada una. Se necesita desarrollar un
sistema (sin uso de bases de datos, unicamente manejo de datos de forma
logica) que permita llevar a cabo lo siguiente.

1.- Cargar el ¨mapa¨ de las filas y asientos. Indicando con una ¨X¨ los
    asientos occupados y con una ¨L¨ los asientos libres. Al iniciar el
    programa, todos los asientos deben estar libres.

2.- Manejar la reserva de asientos contemplando que un asiento SOLO
    PUEDE SER RESERVADO si se encuentra en estado ¨L¨, en caso de que
    este en un estado ¨X¨, se debera permitir al comprador elegir otro asiento.
    Si se enuentra en estado ¨L¨, debera pasar automaticamente al estado 
    ¨X¨.

3.- Para finalizar el programa se debera ingresar un valor en
    particular. Contemplar que no existe una cantidad exacta de veces que
    el programa s pueda ejecutar.

4.- Contemplar que SOLO EXISTEN 10 FILAS Y 10 ASIENTOS. No se pueden
    vender asientos fuera de esas numeraciones. No se permite
    ¨sobreventa¨.

CONSIDERACIONES: No es necesaria implementacion ni de IGU ni de BD. Se
evaluara 100% el manejo de logica del desarrollo de la aplicacion.

EXTRA: En caso de que un cliente solicite visualizar cuales son los
asientos libres, el sistema debe permitir mostrar de forma grafica el
mapa de asientos. NO UTILIZAR IGU para este caso. Utilizar
UNICAMENTE logica y la salida por consola.

BY: TodoCode.
