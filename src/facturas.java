public class facturas {
    package features;

        private int id;
        private int idCliente;
        private String numFactura;
        private String fecha;
        private String concepto;
        private double importe;

        public int getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(int idCliente) {
            this.idCliente = idCliente;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNumFactura() {
            return numFactura;
        }

        public void setNumFactura(String numFactura) {
            this.numFactura = numFactura;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public String getConcepto() {
            return concepto;
        }

        public void setConcepto(String concepto) {
            this.concepto = concepto;
        }

        public double getImporte() {
            return importe;
        }

        public void setImporte(double importe) {
            this.importe = importe;
        }
    }


