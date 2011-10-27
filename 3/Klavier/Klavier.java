/**
 * WICHTIG: Fuer die Bearbeitung dieser Aufgabe ist es nicht noetig,
 * die Klasse Klavier zu verstehen. Sie muessen und sollen an dieser
 * Klasse auch nichts aendern.
 */

// Diese Import-Anweisungen werden benoetigt, um das Java-Soundsystem zu
// verwenden.
import javax.sound.midi.*;

public class Klavier {

    // Die Schnittstelle, ueber die wir MIDI-Sounds abspielen koennen. 
    private Receiver midiReceiver;

    /**
     * Erstellt ein neues Klavier.
     */
    public Klavier() {
        try {
            // Initialisiere das MIDI-Soundsystem, mit dem man Toene abspielen
            // kann.
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            midiReceiver = synth.getReceiver();
        } catch (MidiUnavailableException exc) {
            System.console().printf("MIDI-Soundsystem nicht verfuegbar.");
        }
    }

    /*
     * Spielt einen 500 Millisekunden langen Ton mit der angegebenen Tonhoehe
     * ab. Die Tonhoehe wird in Halbtoenen angegeben, z. B. ist 40 ein c,
     * 41 ein cis und 42 ein d.
     */
    public void spieleTon(int tonhoehe) {
        System.console().printf("Spiele Ton: " + tonhoehe + "\n");
        try {
            // Eine Anweisung im MIDI-Format
            ShortMessage msg = new ShortMessage();
            // Erstelle und sende das Startsignal.
            msg.setMessage(ShortMessage.NOTE_ON, 0, tonhoehe, tonhoehe + 10);
            midiReceiver.send(msg, -1);
            // Warte 500 Millisekunden
            Thread.sleep(500);
            // Erstelle und sende das Endsignal.
            msg.setMessage(ShortMessage.NOTE_OFF, 0, tonhoehe, tonhoehe + 10);
            midiReceiver.send(msg, -1);
        } catch (InvalidMidiDataException e) {
            // Dieser Fehler sollte normalerweise nicht auftreten. Wenn doch,
            // zeige eine Fehlermeldung an.
            e.printStackTrace();
        } catch (InterruptedException e) {
            // Dieser Fehler sollte ebenfalls nie auftreten.
            e.printStackTrace();
        }
    }
}
