import tkinter as tk
from tkinter import ttk
#root = tk.Tk()
class Menu:
    def __init__(self, root):
        self.root = root
        self.root.title ("Analizador Sintáctico y Léxico DO WHILE JAVA ")

        self.text_label = tk.Label (text="ANALIZADOR LÉXICO Y SINTÁCTICO", height=1, width=50)

        self.button_style = ttk.Style()
        self.button_style.configure("EstiloBoton.TButton", font=("Helvetica", 14), padding=20)

        self.frame = tk.Frame(self.root)
        self.frame.pack()

        self.ventana_actual = None

        self.crear_botones()

    def crear_botones (self):
        style = ttk.Style
        boton_ventana1 = ttk.Button(self.frame, text="Analizador Sintáctico", style="EstiloBoton.TButton",
                                     command=self.mostrar_ventana1)

        boton_ventana2 = ttk.Button(self.frame, text="Analizador Léxico", style="EstiloBoton.TButton",
                                     command=self.mostrar_ventana2)

        boton_ventana1.pack(fill="x", padx=10, pady=5)
        boton_ventana2.pack(fill="x", padx=10, pady=5)

    def mostrar_ventana1(self):
        if self.ventana_actual:
            self.ventana_actual.destroy()

        self.crear_interfaz_analizador_sintactico(self.ventana_actual)

    def mostrar_ventana2(self):
        if self.ventana_actual:
            self.ventana_actual.destroy()

        self.ventana_actual = tk.Toplevel(self.root)
        self.ventana_actual.title("Analizador Léxico")
        self.crear_interfaz_analizador_lexico(self.ventana_actual)


    def crear_interfaz_analizador_sintactico(self, ventana):
        import AnalizadorSintactico



    def clean_all (self):  # Agregar self como primer argumento
        code_text.delete ("1.0", "end")
        result_text.delete ("1.0", "end")

    def crear_interfaz_analizador_lexico (self, ventana):
        import LexerPp

    def clean_text (self):
        self.code_text.delete ("1.0", "end")
        self.tree.delete (*self.tree.get_children ())

    def crear_boton_regresar (self, ventana):
        regresar_button = tk.Button (ventana, text="Regresar al Menú", command=self.regresar_al_menu)
        regresar_button.pack (side="bottom", pady=10)

    def regresar_al_menu (self):
        if self.ventana_actual:
            self.ventana_actual.destroy ()
            self.ventana_actual = None


if __name__ == "__main__":
    root = tk.Tk ()
    app = Menu(root)
    root.mainloop ()