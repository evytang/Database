package Parsers;

public enum TokenType
{

    COMMA,
    BRACKET_LEFT, BRACKET_RIGHT,
    EQUALS, LESS_THAN, GREATER_THAN, LESS_THAN_EQ, GREATER_THAN_EQ, NOT_EQUAL_TO, LIKE,
    NUMBER, STRING,

    USE, CREATE, DROP, ALTER, INSERT, SELECT, UPDATE, DELETE, JOIN,
    DATABASE, TABLE,
    INTO, VALUES, FROM, SET, WHERE, ON,
    TRUE, FALSE,
    AND, OR,
    VARIABLE

}



