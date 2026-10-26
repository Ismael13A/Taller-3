Preguntas de análisis
1.- ¿En qué parte del ejercicio se aplica IoC y en cuál DI?
Inversión de Control se aplica cuando asignamos el control del ciclo de vida mediantes las anotaciones @ApplicationScoped, @Dependent y @QuarkusMain, ya que de esta manera el contenedor se encargará de crear las dependencias de negocio.
Inyección de dependencias aplicamos en la clase VentaService al momento de inyectar las clases DescuentoVip, DescuentoRegular y Auditoria. Esto lo realizamos con ayuda del @Inject y el @Named para que el contenedor se encargue de insertar las instancias requeridas.
2.- ¿Qué función cumplen los Qualifiers y por qué son necesarios?
Los Qualifiers ayuda a identificar (etiquetar) de manera única a una clase u objeto dentro del contenedor, como por ejemplo en nuestro código las clases DecuentoVip y DescuentoRegular. 
Son necesarios cuando existen clases múltiples que implementan un interfaz. Sin los Qualifiers el contenedor no sabría a cuál de las implementaciones inyectar y ocasionaría un error, entonces le ayuda al contenedor a identificar la clase que debe inyectar.
3.- ¿Cuál es la diferencia entre @ApplicationScoped y @Dependent?
@ApplicationScoped: Indica que el contenedor creara una sola instancia durante toda la ejecución de el programa. Esta va a vivir mientras la aplicación este activa.
@Dependent: Su ciclo de vida dependerá estrictamente de el objeto que lo inyecte. Creará una instancia nueva y única por cada vez que se lo inyecte.
4.- ¿Por qué las instancias @ApplicationScoped pueden reutilizarse entre varias ventas?
Por que su ciclo de vida estará activo siempre que la aplicación este activa, y como crea una única instancia en el contendor esta se puede reutilizar las veces que haga necesario sin necesidad de crear aún más instancias.
5.- ¿Qué sucedería si se elimina el Qualifier de un punto de inyección de CalculadoraDescuento?
El contenedor arrojara un error en tiempo de compilación (AmbiguousResolutionException). Al existir 2 clases que implementan la interfaz, el contenedor no sabrá cual de las dos inyectar debido a que no tendrán ninguna etiqueta.
# pa2_u1_p2_ia

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./mvnw quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/pa2_u1_p2_ia-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Provided Code

### REST

Easily start your REST Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
