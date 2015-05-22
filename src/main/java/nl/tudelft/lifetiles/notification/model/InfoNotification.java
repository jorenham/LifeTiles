package nl.tudelft.lifetiles.notification.model;

import javafx.scene.paint.Color;

/**
 * An info notification.
 *
 * @author Joren Hammudoglu
 *
 */
public class InfoNotification extends Notification {

    /**
     * The prefix of the message.
     */
    private static final String PREFIX = "Info: ";

    /**
     * Create a new info notification.
     *
     * @param message
     *            the info message
     */
    public InfoNotification(final String message) {
        super(PREFIX + message);
        final int defaultDuration = 5;
        setDuration(defaultDuration);
    }

    @Override
    public final Color getColor() {
        return Color.AQUA;
    }

    @Override
    public final int getPriority() {
        final int priority = 30;
        return priority;
    }

}
