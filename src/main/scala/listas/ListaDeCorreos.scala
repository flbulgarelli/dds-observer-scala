package listas

class ListaDeCorreos(
  usuarios: List[Usuario],
  observadores: List[ObservadorEnvioDeMail]) {

  def enviarMail(mail: Mail) =
    usuarios.foreach { usuario =>
      notificarObservadoresEnvioMail(usuario, mail)
    }

  def notificarObservadoresEnvioMail(
    usuario: Usuario, mail: Mail) =
    observadores.foreach { observador =>
      observador.notificadoEnvioMail(usuario, mail)
    }
}

case class Usuario(mail: String) {
  def cuentaPrimaria = mail
}

case class Mail(
  emailOrigen: String,
  titulo: String,
  texto: String)
