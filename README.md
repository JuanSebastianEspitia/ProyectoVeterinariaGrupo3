# Manual de Usuario – Sistema de Veterinaria

Guía paso a paso para registrar vacunas y empleados, agregar dueños y mascotas, agendar citas, atender consultas, consultar historiales clínicos y generar el comprobante de pago.



## Tabla de contenido

1. [Introducción](#introducción)
2. [Paso a paso](#paso-a-paso)
3. [Mensajes de error y cómo solucionarlos](#mensajes-de-error-y-cómo-solucionarlos)

---

## Introducción

**Sistema de Veterinaria** permite registrar al personal de la clínica (recepcionistas y veterinarios), las vacunas disponibles, los dueños con sus mascotas (convencionales o exóticas), las citas, las consultas médicas con su historial clínico y el cobro final con su comprobante.

### Elementos de la ventana principal

La ventana tiene cuatro pestañas en la parte superior:

| Pestaña | Descripción |
|---|---|
| **EMPLEADOS** | Registro de recepcionistas y veterinarios. |
| **DUEÑOS Y MASCOTAS** | Registro de dueños y mascotas, agendamiento de citas y generación de facturas. |
| **CONSULTA** | Atención de citas (consulta médica) y consulta del historial clínico. |
| **VACUNAS** | Registro de las vacunas disponibles con su precio. |

### Orden recomendado

`Registrar Vacunas` → `Registrar Empleados` → `Registrar Dueño` → `Registrar Mascota` → `Agendar Cita` → `Generar Consulta` → `Generar Factura`

### Reglas de cobro

| Concepto | Valor |
|---|---|
| Tarifa base (toda mascota) | $50000 |
| Recargo por mascota exótica | 25 % de la tarifa base ($12500) |
| Vacunas aplicadas (solo convencionales) | Suma del valor de cada vacuna seleccionada |
| Sedación | $4000 |
| Descuento | 10 % del total si el dueño tiene **más de dos mascotas** registradas |

---

## Paso a paso

### Paso 1. Abrir la aplicación

Ejecute el archivo **[ProyectoVeterinariaGrupo3].java**. Se abrirá la ventana principal con las cuatro pestañas y los campos vacíos.

> Los datos no se guardan en disco: al cerrar la ventana se cierra todo el programa y se pierde la información registrada.



### Paso 2. Registrar las vacunas

Entre a la pestaña **VACUNAS**. Escriba el nombre en **Vacuna** (por ejemplo, `Rabia`) y el **Precio** (solo números, por ejemplo, `30000`). Presione **AGREGAR VACUNA**.

![Paso 2](readmeImagenes/2.jpg)

### Paso 3. Confirmar la vacuna

Aparecerá el mensaje *"VACUNA (NOMBRE) FUE AGREGADA CORRECTAMENTE"*. Presione **OK**. La vacuna aparece en la lista **VACUNAS DISPONIBLES** con el formato `Nombre - $Precio`.

> Repita los pasos 2 y 3 por cada vacuna que ofrezca la clínica. No presione **Enter** dentro del campo *Vacuna*; use siempre el botón.

![Paso 3](readmeImagenes/3.jpg)

### Paso 4. Registrar un recepcionista

Entre a la pestaña **EMPLEADOS**. En la sección **RECEPCIONISTA** complete **Nombre, Correo, Documento, Teléfono** y **Sueldo** (solo números; para decimales use punto) y presione **REGISTRAR RECEPCIONISTA**. Verá el mensaje *"RECEPCIONISTA (NOMBRE) FUE AGREGADO CORRECTAMENTE"*; presione **OK**.

![Paso 4](readmeImagenes/4.jpg)
![Paso 4.1](readmeImagenes/4.1.jpg)

### Paso 5. Registrar un veterinario

En la sección **VETERINARIO** complete **Nombre, Correo, Documento, Teléfono, Sueldo, Tarjeta Profesional** y **Especialidad** (todos son obligatorios) y presione **REGISTRAR VETERINARIO**. Verá un mensaje con el nombre, la tarjeta y la especialidad del veterinario; presione **OK**.

> Es necesario registrar al menos un veterinario para poder agendar citas y atender consultas. Repita los pasos 4 y 5 por cada empleado.

![Paso 5](readmeImagenes/5.jpg)
![Paso 5.1](readmeImagenes/5.1.jpg)

### Paso 6. Registrar un dueño

Entre a la pestaña **DUEÑOS Y MASCOTAS**. En el bloque **DUEÑO(S)** complete **Nombre, Documento, Correo** y **Teléfono** y presione **REGISTRAR DUEÑO**. Verá el mensaje *"DUEÑO (NOMBRE) FUE AGREGADO CORRECTAMENTE"*; presione **OK**.

> El dueño queda disponible en todas las listas de dueños del programa. Repita este paso por cada dueño.

![Paso 6](readmeImagenes/6.jpg)
![Paso 6.1](readmeImagenes/6.1.jpg)

### Paso 7. Registrar una mascota convencional

En el bloque **MASCOTA(S)** deje el **Tipo de Mascota** en `CONVENCIONAL` (perros y gatos). Seleccione el **Dueño**, complete **Nombre, Edad, Peso** y **Raza**, y elija el **Género** (`Macho` o `Hembra`).

En el campo **Vacunas** escriba las vacunas iniciales de la mascota, **una por línea**. Presione **REGISTRAR MASCOTA**. Verá el mensaje *"MASCOTA (NOMBRE) FUE AGREGADA AL DUEÑO (NOMBRE)"*; presione **OK**.

> Con el tipo convencional, el campo **ICA (CITES)** se deshabilita.

![Paso 7](readmeImagenes/7)
![Paso 7.1](readmeImagenes/7.1.jpg)

### Paso 8. Registrar una mascota exótica

Cambie el **Tipo de Mascota** a `EXÓTICA` (aves, reptiles y pequeños mamíferos). Seleccione el **Dueño**, complete **Nombre, Edad, Peso**, elija el **Género** y escriba el permiso ambiental en **ICA (CITES)**. Presione **REGISTRAR MASCOTA**.

> Con el tipo exótico, los campos **Raza** y **Vacunas** se deshabilitan y se borran. Si un dueño llega a tener más de dos mascotas, sus consultas recibirán automáticamente el 10 % de descuento.

![Paso 8](readmeImagenes/8)
![Paso 8.1](readmeImagenes/8.1.jpg)

### Paso 9. Agendar una cita

En el bloque **HORARIOS DE CITAS** elija la **Fecha de la Cita** (formato `aaaa/mm/dd`; use las flechas o escríbala) y la **Hora de la Cita** (de 08:00 a 17:30, cada 30 minutos). Seleccione el **Dueño** y luego la **Mascota** (la lista muestra solo las mascotas de ese dueño). Presione **AGENDAR CITA**.

Verá un mensaje con la mascota, el dueño, la fecha y la hora de la cita; presione **OK**.

> Repita este paso por cada cita requerida. Las citas quedan ordenadas y disponibles en la pestaña **CONSULTA**.

![Paso 9](readmeImagenes/9)
![Paso 9.1](readmeImagenes/9.1.jpg)

### Paso 10. Abrir la pestaña CONSULTA y elegir la cita

Entre a la pestaña **CONSULTA**. Seleccione el **Veterinario** que atenderá y la **Cita** pendiente en las listas desplegables.



### Paso 11. Llenar los datos de la consulta

Escriba el **Tratamiento Aplicado** y el **Diagnóstico**. Marque **Sedación** si se aplicó sedación a la mascota. En **Vacunas Aplicadas** seleccione las vacunas aplicadas (mantenga presionada la tecla `Ctrl` para elegir varias).

![Paso 11](readmeImagenes/11.jpg)

### Paso 12. Consulta de una mascota exótica

Si la cita seleccionada es de una mascota exótica, la lista **Vacunas Aplicadas** sigue visible pero aparece **deshabilitada** (en gris) y no se puede seleccionar nada, porque las vacunas no se cobran a las mascotas exóticas. Al seleccionar una cita de una mascota convencional, la lista se habilita de nuevo.

![Paso 12](readmeImagenes/12.jpg)
![Paso 12.1](readmeImagenes/12.1.jpg)

### Paso 13. Presionar "GENERAR CONSULTA"

Haga clic en **GENERAR CONSULTA**. Aparecerá el mensaje *"CONSULTA GENERADA PARA LA MASCOTA (NOMBRE) – LA CITA FUÉ ATENDIDA"*. Presione **OK**.

La cita sale de la lista de pendientes, la consulta queda guardada en el historial de la mascota y aparece en **Citas Atendidas** lista para facturar.

![Paso 13](readmeImagenes/13.jpg)

### Paso 14. Ver el historial clínico

En la misma pestaña, seleccione el **Dueño** y la **Mascota** (la lista muestra solo las mascotas de ese dueño) y presione **VER HISTORIAL CLÍNICO**. Se abrirá una ventana con todas las consultas de la mascota: fecha, datos del dueño y de la mascota, veterinario, diagnóstico, sedación y vacunas.

> En la primera consulta de una mascota convencional también se muestran sus **vacunas iniciales**.

![Paso 14](readmeImagenes/14.jpg)
![Paso 14.1](readmeImagenes/14.1.jpg)

### Paso 15. Generar la factura

Vuelva a la pestaña **DUEÑOS Y MASCOTAS**. En el bloque **GENERAR FACTURAS**, elija en **Citas Atendidas** la consulta que desea cobrar y presione **GENERAR FACTURA**.

![Paso 15](readmeImagenes/15.jpg)

### Paso 16. Revisar el comprobante de pago

Se mostrará el **COMPROBANTE DE PAGO** con el código de la factura, los datos de la mascota y del dueño, el costo base, el recargo exótico, las vacunas, la sedación, el descuento y el **total a pagar**. Presione **OK**.

La consulta facturada desaparece de la lista **Citas Atendidas**.

![Paso 16](readmeImagenes/16.jpg)

---

## Mensajes de error y cómo solucionarlos

La aplicación valida los datos y muestra avisos cuando falta información o algo es incorrecto. En todos los casos presione **OK**, corrija lo indicado y vuelva a intentar.

### Falta un dato del recepcionista

Si deja vacío algún campo al presionar **REGISTRAR RECEPCIONISTA**, se muestra *"ERROR: debe de llenar todos los campos"*. Complete los cinco campos.

![Error recepcionista](readmeImagenes/ErrorRecepcionista.jpg)

### Falta un dato del veterinario

Si deja vacío algún campo al presionar **REGISTRAR VETERINARIO**, se muestra *"ERROR: debe de completar todos los campos"*. Complete los siete campos.

![Error veterinario](readmeImagenes/ErrorVeterinario.jpg)

### Sueldo inválido

Si el sueldo contiene letras, símbolos o coma decimal (por ejemplo, `1.500,50` o `mil`), se muestra *"ERROR: el sueldo debe ser un número válido"*. Escriba solo números y use punto para los decimales.

![Error sueldo](readmeImagenes/ErrorSueldo.jpg)

### Falta un dato del dueño

Si deja vacío algún campo al presionar **REGISTRAR DUEÑO**, se muestra *"ERROR: debe de completar todos los campos"*. Complete los cuatro campos.

![Error dueño](readmeImagenes/FaltanDatosDelDueño.jpg)

### Falta un dato de la vacuna

Si deja vacío el nombre o el precio, se muestra *"ERROR: debe de completar todos los campos"*. Complete ambos campos.

![Error vacuna](readmeImagenes/FaltaUnDatoDeLaVacuna.jpg)

### Precio de la vacuna inválido

Si el precio contiene letras o símbolos, se muestra *"ERROR: el precio debe ser un número válido"*. Escriba solo números.

![Error precio](readmeImagenes/PrecioDeLaVacunaInvalido.jpgg)

### Registrar una mascota sin dueño

Si presiona **REGISTRAR MASCOTA** sin dueños registrados o sin ninguno seleccionado, se muestra *"ERROR: primero debe registrar y seleccionar un dueño"*. Registre un dueño y selecciónelo en la lista.

![Error sin dueño](readmeImagenes/RegistrarUnaMascotaSinDueño.jpg)

### Falta un dato de la mascota

Si deja vacío el nombre, la edad, el peso, la raza (mascota convencional) o el ICA (CITES) (mascota exótica), se muestra *"ERROR: debe de completar todos los campos"*. Complete los campos del tipo de mascota elegido.

![Error mascota](readmeImagenes/FaltaUnDatoDeLaMascota.jpg)

### Agendar una cita sin veterinarios

Si presiona **AGENDAR CITA** sin veterinarios registrados, se muestra *"ERROR: No hay veterinarios registrados. No es posible agendar una cita."*. Registre un veterinario en la pestaña **EMPLEADOS**.

![Error cita sin veterinario](readmeImagenes/AgendarUnaCitaSinVeterinarios.jpg)

### Generar una consulta sin veterinario

Si no hay veterinario seleccionado, se muestra *"ERROR: debe seleccionar un veterinario"*. Registre y seleccione un veterinario.

![Error consulta sin veterinario](readmeImagenes/ConsultaVeterinario.jpg)

### Generar una consulta sin citas pendientes

Si no hay citas agendadas, o ya fueron atendidas todas, se muestra *"ERROR: no hay citas pendientes para atender"*. Agende una cita primero.

![Error sin citas](readmeImagenes/GenerarUnaConsultaSinCitasPendientes.jpg)

### Falta un dato de la consulta

Si deja vacío el tratamiento o el diagnóstico, se muestra *"ERROR: debe de completar todos los campos"*. Complete ambos campos.

![Error consulta](readmeImagenes/FaltaUnDatoDeLaConsulta.jpg)

### Ver el historial sin seleccionar dueño y mascota

Se muestra *"ERROR: debe seleccionar un dueño y una mascota"*. Seleccione ambos. Si el dueño no tiene mascotas, registre una primero.

![Error historial](readmeImagenes/ErrorHistorial.jpg)

### Ver el historial de una mascota sin consultas

Se muestra *"ERROR: (NOMBRE) aún no tiene consultas"*. Atienda una cita de esa mascota primero.

![Error historial vacío](readmeImagenes/ErrorHistorialVacio.jpg)

### Generar una factura sin consultas atendidas

Se muestra *"ERROR: no hay citas atendidas para facturar"*. Atienda una cita en la pestaña **CONSULTA** primero.

![Error sin facturas](readmeImagenes/ErrorSinFacturas.jpg)

### Agendar una cita sin dueño o mascota seleccionados

Si no hay dueños registrados o el dueño no tiene mascotas, el programa **no muestra ningún mensaje** y la cita no se crea correctamente. Registre un dueño y una mascota antes de agendar.

### Letras en Edad o Peso

El programa **no valida** que la edad y el peso sean números: acepta cualquier texto. Escriba solo números.

### Se presionó Enter en el campo "Vacuna"

Puede generarse un error interno en la consola y no se registra la vacuna. Use siempre el botón **AGREGAR VACUNA**.

### Dos mascotas con nombres parecidos del mismo dueño

Al agendar, puede seleccionarse la mascota equivocada si un nombre está contenido en otro (por ejemplo, `Max` y `Maximus`). Use nombres distintos para las mascotas de un mismo dueño.

### Se perdieron los datos o se cerró todo el programa

Los datos no se guardan en disco, y cerrar la ventana con la "X" cierra todo el programa. Si cerró el programa, vuelva a registrar los datos.


GRUPO:
[Wilmer Fernando Camero Cárdenas] ([1152715])
[Juan Sebastian Espitia Sepúlveda] ([1152727])
[Maikol Alonso Paredes Hernández] ([1152695])
