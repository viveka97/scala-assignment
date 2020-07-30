
object q3 extends App{

  class Account(private var balance : Double = 0)
  {

    def transfer(account: Account, amount: Double): Unit =
    {

      this.balance -= amount
      account.balance += amount

    }
  }

  val account1= new Account(127.3)
  val account2= new Account(10.5)

  account1.transfer(account2, 10)



}
