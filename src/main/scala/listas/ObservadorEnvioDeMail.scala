package listas

trait ObservadorEnvioDeMail {
  def notificadoEnvioMail(usuario: Usuario, mail: Mail)
}