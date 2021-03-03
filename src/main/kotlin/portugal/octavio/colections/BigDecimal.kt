package portugal.octavio.colections

import java.math.BigDecimal

fun Array<BigDecimal>.somatoria() = this.reduce {
    acc, valor -> valor
}

fun Array<BigDecimal>.media()=
    if(this.isEmpty()) BigDecimal.ZERO
else this.somatoria() / this.size.toBigDecimal()