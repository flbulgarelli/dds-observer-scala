package listas

trait MailSender {
  def enviarMail(destinatario: String, mail:Mail) 
}