package cuentas;

/**

 * Aquesta clase conte  el atributs nombre,cuenta,saldo,tipointeres y metodes per realitzar operacions amb una conta de banc

 * @author: Pedro Rodriguez

 */
    public class CCuenta {


       protected String nombre;
        protected String cuenta;
        protected double saldo;
        protected double tipoInterés;

        public CCuenta()
        {
        }
    /**

     * Constructor

     */
        public CCuenta(String nom, String cue, double sal, double tipo)
        {
            nombre =nom;
            cuenta=cue;
            saldo=sal;
        }
    /**

     * Metode que mostra el saldo de la conta

     * @return Torna el saldo de la conta bancaria

     */
        public double estado()
        {
            return saldo;
        }
    /**

     * Metode que fa un ingres a la conta del banc


     */
        public void ingresar(double cantidad) throws Exception
        {
            if (cantidad<0)
                throw new Exception("No se puede ingresar una cantidad negativa");
            saldo = saldo + cantidad;
        }
    /**

     * Metode que retira diners de  la conta del banc


     */
        public void retirar(double cantidad) throws Exception
        {
            if (cantidad <= 0)
                throw new Exception ("No se puede retirar una cantidad negativa");
            if (estado()< cantidad)
                throw new Exception ("No se hay suficiente saldo");
            saldo = saldo - cantidad;
        }
    }


