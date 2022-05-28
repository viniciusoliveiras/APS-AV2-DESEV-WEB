<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://cdn.tailwindcss.com"></script>
        <title>Calculadora</title>
    </head>
    <body class="flex items-center justify-center h-screen w-screen flex-col gap-16">
        <% String welcome_msg = "Insira duas notas para descobrir a média de um período de avaliação.";%>
        <%= welcome_msg%>

        <form action="calculate" method="post" class="flex flex-col gap-2">
            <input type="number" name="nota1" placeholder="Nota 1" id="username"
                   class="px-4 py-2 outline-0 rounded w-full border border-blue-500" />
            <input type="number" name="nota2" placeholder="Nota 2" id="password"
                   class="px-4 py-2 outline-0 rounded w-full border border-blue-500" />

            <button type="submit"
                    class="bg-blue-300 hover:bg-blue-400 font-semibold text-sm rounded w-full px-4 py-2 self-center mt-4">Entrar</button>
        </form>
    </body>
</html>
