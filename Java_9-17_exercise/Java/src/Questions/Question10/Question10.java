package Questions.Question10;
/*
    Q10. Demonstrate the use of repeat, strip, isBlank, indent, transform, stripIndent,
         translateEscapes, formatted String methods.
 */
public class Question10 {
    public static void main(String[] args) {
        String str = "     hello \n";
        String str1 =
                    "\t\t\t\t\t<html>\n"+
                    "\t\t\t\t\t\t\t<body>\n"+
                    "\t\t\t\t\t\t\t\t<p>Hello, world</p>\n"+
                    "\t\t\t\t\t\t\t</body>\n"+
                    "\t\t\t\t\t</html>\n";
        System.out.println(("Repeat :: "+str).repeat(3));
        System.out.println("strip :: "+str.strip());
        System.out.println("isBlank :: "+str.isBlank());
        System.out.println("indent :: "+str.indent(5));
        System.out.println("transform :: "+str.transform(e->e.strip()+" world"));
        System.out.println("stripIndent :: \n"+str1.stripIndent());
        System.out.println("translateEscapes :: "+str.translateEscapes());
        System.out.println("formatted String methods :: "+"Java %s".formatted(9));

    }
}

/*
    OUTPUT
        Repeat ::      hello
        Repeat ::      hello
        Repeat ::      hello

        strip :: hello
        isBlank :: false
        indent ::           hello

        transform :: hello world
        stripIndent ::
                            <html>
                                    <body>
                                        <p>Hello, world</p>
                                    </body>
                            </html>

        translateEscapes ::      hello

        formatted String methods :: Java 9

 */