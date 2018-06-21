package model;

import org.w3c.dom.Document;

/**
 * Гарантирует, что объект имеет XML-представление
 * @author Сова
 */
public interface XMLTranslatable {
    Document getXML();
}
