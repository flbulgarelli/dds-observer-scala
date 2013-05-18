package listas

class ObservadorLogueador extends ObservadorEnvioDeMail {

  def notificadoEnvioMail(usuario: Usuario, mail: Mail) =
    Logger.loggear("se envio un mail" + usuario)

}

class ObservadorQueEnviaMails(mailSender: MailSender)
  extends ObservadorEnvioDeMail {

  def notificadoEnvioMail(
    usuario: Usuario,
    mail: Mail) =
    mailSender.enviarMail(usuario.cuentaPrimaria, mail)

}