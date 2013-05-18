package listas

import org.scalatest.FlatSpec
import org.scalatest.FunSuite

class SuscripcionTest extends FunSuite {

  /*enviar un correo, dada una direccion de email
   * origen, título y texto
   */

  test("puedo interactuar con una lista de correos") {
    //pre
    val listaDeCorreos = new ListaDeCorreos(
      List(
        Usuario("juan@bleh"),
        Usuario("gaston@bleh")),
      List(new ObservadorQueEnviaMails()))

    //op
    listaDeCorreos.enviarMail(Mail(
      "flbulgarelli@gmail.com",
      "Hola!",
      "el contenido"))

    //post
     // :P
  }

  /*
   * El sistema interactua con otro sistema externo 
   */

  /*
   * contemplar la posibilidad de que el envío falle
   */

  /*
   * Cada usuario puede definir multiples correos. 
   * Puede enviar de todos ellos, pero solo a uno 
   * recibe los mails
   */

}