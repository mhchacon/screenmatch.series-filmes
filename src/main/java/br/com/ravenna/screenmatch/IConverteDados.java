package br.com.ravenna.screenmatch;

public interface IConverteDados {
   <T> T obterDados(String json, Class<T> classe);
}
