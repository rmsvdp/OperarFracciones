package Basics;

import java.util.Date;

public class CuentaBancaria {

	public CuentaBancaria() {
		super();
		this.Saldo = (float) 0.0;
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Código IBAN de la cuenta 
	 */
	private String CCC="ES98bbbbssssdd0000000000";
	/**
	 * Saldo
	 */
	private float Saldo=0;
	/**
	 * Devuelve el número de cuenta del objeto
	 * @return valor de CCC
	 */	public String getCCC() {
		return CCC;
	}
	/**
	 * Establece el número de cuenta del objeto
	 * @return valor de CCC
	 */
	public void setCCC(String cCC) {
		CCC = cCC;
	}
	public float getSaldo() {
		return Saldo;
	}
	public void setSaldo(float saldo) {
		Saldo = saldo;
	}
/**
 * Efectua un ingreso en cuenta
 * @param cantidad Importe a ingresar ( no puede ser negativo)
 * @return True operación completada
 *         False error en la operación
 */
	public boolean ingresaEnCuenta(float cantidad) {
		boolean result;
		if (cantidad<0) {result = false;}
		else {
			Saldo += cantidad;
			result = true;
		}
		return result;
	}

	/**
	 * Efectua una retirada en cuenta
	 * @param cantidad Importe a ingresar ( no puede ser negativo)
	 * @return True operación completada
	 *         False error en la operación
	 */
		public boolean retiraDeCuenta(float cantidad) {
			boolean result;
			if (cantidad<0) {result = false;}
			else {
				Saldo -= cantidad;
				result = true;
			}
			return result;
		}
/**
 * Efectúa una transferenia de dinero		
 * @param _ccc cuenta de destino
 * @param cantidad importe a transferir
 * @return resultado de la operación
 */
		public boolean transferencia(String _ccc,float cantidad) {
			boolean result;
			if ((Saldo >= cantidad) && (cantidad >0)) {
			Saldo  -= cantidad;
			result = true;
			} else
			{
				result = false;
			}
			return result;	
		}			
   public void ultimosMovimientos() {
	    
   }
 
} // Class	

