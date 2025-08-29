public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 30) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido (1-30).");
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês inválido (1-12).");
        }
    }

    public void setAno(int ano) {
        if (ano >= 1900) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido (>=1900).");
        }
    }

    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }

    public String formatarData() {
        // corrigido: barra entre dia e mês
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    @Override
    public String toString() { return formatarData();
    }
}
