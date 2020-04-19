<?xml version="1.0"  ?>
<xsl:stylesheet xmlns="http://www.w3.org/1999/XSL/Transform" version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="checkbook">
        <html>
            <head/>
            <body>
                <h3>
                    <xsl:text>Income from</xsl:text>
                    <xsl:value-of select="child::*[1]/date"/>
                    <xsl:text>until</xsl:text>
                    <xsl:value-of select="child::*[last()]/date"/>
                    <xsl:text>:</xsl:text>
                </h3>
                <xsl:apply-templates select="deposit"/>
                <h3>
                    <xsl:text>Expenditures from</xsl:text>
                    <xsl:value-of select="child::*[1]/date"/>
                    <xsl:text>until</xsl:text>
                    <xsl:value-of select="child::*[last()]/date"/>
                    <xsl:text>, ranked from highest to lowest:</xsl:text>
                </h3>
                <xsl:apply-templates select="payment">
                    <xsl:sort data-type="number" order="descending" select="amount"/>
                </xsl:apply-templates>
                <h3>Balance</h3>
                <p>
                    <xsl:text>Your balance as of</xsl:text>
                    <xsl:value-of select="child::*[last()]/date"/>
                    <xsl:text> is </xsl:text>
                    <tt>
                        <b>
                            <xsl:choose>
                                <xsl:when test="sum( payment/amount )>sum( deposit/amount )">
                                    <font color="red">
                                        <xsl:text>$</xsl:text>
                                        <xsl:value-of select="sum( deposit/amount )- sum( payment/amount )"/>
                                    </font>
                                </xsl:when>
                                <xsl:otherwise>
                                    <font color="blue">
                                        <xsl:text>$</xsl:text>
                                        <xsl:value-of select="sum( deposit/amount )- sum( payment/amount )"/>
                                    </font>
                                </xsl:otherwise>
                            </xsl:choose>
                        </b>
                    </tt>
                </p>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>

