//cambio de osuro-claro
const body = document.querySelector('body'),
      sidebar = body.querySelector('nav'),
      toggle = body.querySelector('.toggle'),
      searchBtn = body.querySelector('.search-box'),
      modeSwitch = body.querySelector('.toggle-switch'),
      modeLang = body.querySelector('.toggle-lang'),
      modeText = body.querySelector('.mode-text'),
      langText = body.querySelector('.lang-text')
      textsToChange = body.querySelectorAll('[data-section]');

//Abrir y cerrar nav
toggle.addEventListener("click", () => {
      sidebar.classList.toggle("close");
})

//Idiomas
const changeLanguage = async (language) => {
      const response = await fetch(`json/${language}.json`);
      const texts = await response.json();
    
      // Cambiar todos los textos según el idioma
      for (const section in texts) {
        const elementsToChange = document.querySelectorAll(`[data-section="${section}"]`);
        
        elementsToChange.forEach((element) => {
          const value = element.dataset.value;
          element.innerHTML = texts[section][value];
        });
      }
    };
    
    modeLang.addEventListener("click", (e) => {
      body.classList.toggle("Idiom");
    
      if (body.classList.contains("Idiom")) {
        langText.innerText = "Español"; // Spanish
        changeLanguage("en");
      } else {
        langText.innerText = "Inglés"; // English
        changeLanguage("es");
      }
    });
    

//Orcuro - Claro
modeSwitch.addEventListener("click", () => {

      body.classList.toggle("dark");
      if (body.classList.contains("dark")){
        modeText.innerText = "Modo Claro" //Ligth mode
      } else {
        modeText.innerText = "Modo Oscuro" //Dark mode
      }

})