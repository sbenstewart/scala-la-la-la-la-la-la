import org.jfugue.pattern.Pattern;
import org.jfugue.player.Player;

object ScalaLaLaLaLaLaLa {
    def main(args: Array[String]) = {
        val p1 = new org.jfugue.pattern.Pattern(s"""Rq D5i+B5i D5i+B5i D5q+B5q D5i+B5i D5i-+B5i- | 
                                                    D5-i+B5-i E5i+C6i E5q+C6q E5i+C6q Rq | 
                                                    Rq D5i+B5i D5i+B5i D5q+B5q D5i+B5i D5i-+B5i- | 
                                                    D5-i+B5-i F#5i+A5i F#5q+A5q F#5q+A5q | 
                                                    Rq G5i G5i G5q G5i G5i- | 
                                                    G5-i D5i E5q D5q Rq | 
                                                    Ri C6i C6i B5q F#5i A5i- | 
                                                    A5-i G5i G5q Rh""").setVoice(0).setInstrument("electric_piano");
        val p2 = new org.jfugue.pattern.Pattern(s"""Rw | 
                                                    Rw | 
                                                    Rw | 
                                                    Rw | 
                                                    Rq E4i+G4i+C5i E4i+G4i+C5i E4q+G4q+C5q E4i+G4i+C5i D4i-+G4i-+B4i-  | 
                                                    D4-i+G4-i+B4-i D4i+G4i+B4i D4q+G4q+B4q D4q+G4q+B4q Rq | 
                                                    Rq D4i+F#4i+C5i D4i+F#4i+C5i D4q+F#4q+C5q D4i+F#4i+C5i D4i-+G4i-+B4i- | 
                                                    D4-h+G4-h+B4-h Rh
                                                    """).setVoice(1).setInstrument("accordian");
        val p3 = new org.jfugue.pattern.Pattern(s"""Rw | 
                                                    C3q Ris C3s C3q C3q | 
                                                    G3q Ris G3s G3q Rq | 
                                                    D3q Ris D3s D3q D3q | 
                                                    C3q Ris C3s C3q Rq | 
                                                    G3q Ris G3s G3q G3q | 
                                                    D3q Ris D3s D3q Rq | 
                                                    G3h Rh """).setVoice(2).setInstrument("trumpet");
        val player = new org.jfugue.player.Player();
        player.play(p1,p2,p3);
    }
}
