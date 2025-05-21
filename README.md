# Calculadora de Médias - Android App

Este é um aplicativo Android desenvolvido em **Kotlin** utilizando **XML** para a interface. Ele apresenta duas funcionalidades principais por meio de um layout com **abas**:

## Funcionalidades

### 1. Membros da Equipe
- Lista com cards dos integrantes da equipe.
- Ao clicar em um membro, o app redireciona para uma nova tela com os **detalhes** do integrante.
- Utiliza `RecyclerView` e `Intent` para navegação.

### 2. Calculadora de Médias
- Permite o cálculo da média de notas com base nas regras:
  - Média menor que 4: **Reprovado**
  - Média entre 4 e 6: **Recuperação**
  - Média maior que 6: **Aprovado**
- O resultado é exibido via **Snackbar**.
- Possui botão de **reset** para limpar os campos.

## Tecnologias Utilizadas

- Kotlin
- XML
- ViewPager2 com TabLayout
- RecyclerView
- Material Design Components
- Snackbar

## Organização de Pastas

```bash
├── adapter
│   └── MemberAdapter.kt
│   └── ViewPagerAdapter.kt
├── data
│   └── MembersData.kt
├── model
│   └── Members.kt
├── ui
│   ├── calculator
│   │   └── CalculatorFragment.kt
│   ├── team
│   │   └── DetailMembersActivity.kt
│   │   └── MembersFragment.kt
│   └── SplahsActivity.kt    
└── MainActivity.kt 
```

## Layouts do Projeto

Abaixo estão os arquivos de layout utilizados no projeto:

- `activity_splash.xml` – Tela de **splash** com **logo** exibida ao iniciar o app.
- `activity_main.xml` – Layout principal com **ViewPager2** e **TabLayout**.
- `fragment_members.xml` – Exibe a **lista dos membros** da equipe usando RecyclerView.
- `card_member.xml` – Layout para o **card individual** de cada membro da equipe, usado no RecyclerView.
- `activity_detail_members.xml` – Mostra os **detalhes do membro** com uma AppBar e botão de voltar.
- `fragment_calculator.xml` – Tela da **calculadora de médias**.

## Como Executar o Projeto
1. Clone este repositório:
   ```bash
   git clone https://github.com/WellingtonHSL/App-CalculadoraMedia.git
   ```
2. Abra o projeto no **Android Studio**
3. Execute em um **dispositivo físico** ou **emulador**.

